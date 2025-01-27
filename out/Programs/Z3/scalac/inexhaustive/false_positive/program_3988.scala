package Program_15 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_A), b: T_A) extends T_A
case class CC_B[B]() extends T_A
case class CC_C(a: T_B[Byte], b: CC_A, c: Char) extends T_B[CC_B[CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _) => 1 
  case CC_A((CC_A(_, _),CC_A(_, _)), CC_B()) => 2 
  case CC_A((CC_A(_, _),CC_A(_, _)), CC_A(_, _)) => 3 
  case CC_A((CC_A(_, _),CC_B()), _) => 4 
  case CC_A((CC_B(),CC_B()), CC_A(_, _)) => 5 
  case CC_A(_, CC_A(_, _)) => 6 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_B T_A T_A)