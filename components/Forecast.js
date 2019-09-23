import React from 'react';
import { StyleSheet, Text, View } from 'react-native';

export default class Forecast extends React.Component {
 render() {
    return (
        <View style={{flexDirection:
            'column',
            
            justifyContent:
            'center',
            alignItems:
            'center'}}>
        <Text style={styles.title}>{this.props.main}</Text>
        <Text style={styles.title}>{this.props.description}</Text>
        <Text style={styles.title}>{this.props.temp}°C</Text>

       </View>
    );
 }
}

const styles = StyleSheet.create({
   
    title: {
        fontSize: 50,
        color: 'black',
        
        
      },
   });