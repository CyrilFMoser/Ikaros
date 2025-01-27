package Program_28 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B]() extends T_A
case class CC_B(a: T_B[T_A], b: T_B[T_A]) extends T_A
case class CC_C(a: CC_A[Char], b: T_B[T_A]) extends T_A
case class CC_D[C](a: CC_B, b: T_B[C], c: CC_B) extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_A(), _) => 1 
  case CC_B(_, CC_D(_, _, _)) => 2 
  case CC_B(_, _) => 3 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A Boolean))