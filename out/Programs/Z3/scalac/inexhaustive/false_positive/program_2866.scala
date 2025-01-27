package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(Byte,Int)], b: T_B, c: Boolean) extends T_A[T_A[T_B]]
case class CC_B() extends T_A[T_A[T_B]]
case class CC_C(a: Byte, b: T_A[T_B], c: (T_B,(Char,Byte))) extends T_B
case class CC_D[B](a: (T_B,Char), b: CC_C, c: B) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_D(_, _, _), _) => 1 
  case CC_A(_, CC_C(_, _, _), _) => 2 
}
}
// This is not matched: (CC_A Wildcard
//      (CC_D Boolean Wildcard Wildcard Boolean T_B)
//      Wildcard
//      (T_A (T_A T_B)))
// This is not matched: (CC_E T_B)