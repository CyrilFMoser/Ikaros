package Program_14 

package Program_11 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: (T_A,T_A)) extends T_A
case class CC_B() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_, _), (CC_A(_, _),CC_B())) => 1 
  case CC_A(CC_A(_, _), (CC_A(_, _),CC_A(_, _))) => 2 
  case CC_A(_, (CC_B(),CC_B())) => 3 
  case CC_A(CC_B(), _) => 4 
  case CC_A(CC_B(), (CC_B(),CC_B())) => 5 
  case CC_A(CC_A(_, _), (CC_B(),CC_A(_, _))) => 6 
  case CC_A(CC_B(), (CC_B(),CC_A(_, _))) => 7 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A Byte T_B Wildcard (T_A T_B Byte))