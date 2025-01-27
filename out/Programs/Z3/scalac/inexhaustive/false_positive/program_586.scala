package Program_31 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B](a: (T_A,Byte), b: Int, c: Char) extends T_B[B]
case class CC_C[C, D](a: T_B[T_A], b: T_A) extends T_B[C]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_B((CC_A(),_), _, 'x') => 1 
  case CC_B(_, 12, 'x') => 2 
  case CC_B(_, _, _) => 3 
  case CC_B(_, _, 'x') => 4 
}
}
// This is not matched: (CC_C T_A T_A Wildcard Wildcard (T_B T_A))
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard (T_B T_A))