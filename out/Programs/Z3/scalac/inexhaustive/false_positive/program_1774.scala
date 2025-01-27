package Program_31 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A]) extends T_A
case class CC_C(a: CC_B, b: (T_A,CC_B)) extends T_B[T_A]
case class CC_D[B](a: B, b: Int) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_C(CC_B(_, _), _) => 1 
  case CC_C(_, (CC_A(_),CC_B(_, _))) => 2 
  case CC_C(_, (CC_B(_, _),CC_B(_, _))) => 3 
  case CC_C(_, _) => 4 
}
}
// This is not matched: (CC_D T_A Wildcard Wildcard (T_B T_A))
// This is not matched: (CC_B Boolean Wildcard (T_A (T_A Char)))