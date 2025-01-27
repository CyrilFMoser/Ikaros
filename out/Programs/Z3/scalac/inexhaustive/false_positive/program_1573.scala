package Program_31 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: (Char,Char), b: Byte) extends T_A[T_B[(Boolean,Byte), (Byte,Int)]]

val v_a: T_A[T_B[(Boolean,Byte), (Byte,Int)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(('x','x'), _) => 1 
  case CC_B(('x',_), _) => 2 
  case CC_B(_, _) => 3 
  case CC_B(_, 0) => 4 
  case CC_B((_,'x'), 0) => 5 
  case CC_B((_,'x'), _) => 6 
  case CC_B((_,_), 0) => 7 
  case CC_B(('x',_), 0) => 8 
}
}
// This is not matched: (CC_B Boolean
//      Wildcard
//      Wildcard
//      (T_A (T_B (Tuple Boolean Byte) (Tuple Byte Int))))
// This is not matched: (CC_E (T_B Int))