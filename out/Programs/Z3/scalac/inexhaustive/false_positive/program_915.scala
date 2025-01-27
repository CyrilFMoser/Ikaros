package Program_31 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[T_A[(Char,Byte)]]
case class CC_B() extends T_A[T_A[(Char,Byte)]]

val v_a: T_A[T_A[(Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A (Tuple Char Byte))))
// This is not matched: Pattern match is empty without constants