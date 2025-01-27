package Program_14 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: T_B[T_A]) extends T_A
case class CC_D[B, C](a: T_A, b: CC_A, c: Char) extends T_B[B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(), _, _) => 0 
  case CC_D(CC_B(), CC_A(), 'x') => 1 
  case CC_D(CC_B(), _, 'x') => 2 
  case CC_D(_, CC_A(), _) => 3 
  case CC_D(CC_C(_, _), _, _) => 4 
  case CC_D(CC_C(_, _), CC_A(), _) => 5 
  case CC_D(_, CC_A(), 'x') => 6 
  case CC_D(_, _, _) => 7 
  case CC_D(CC_A(), _, 'x') => 8 
  case CC_D(CC_A(), _, _) => 9 
  case CC_D(CC_C(_, _), CC_A(), 'x') => 10 
  case CC_D(CC_A(), CC_A(), 'x') => 11 
}
}
// This is not matched: (CC_D (CC_B (T_B T_A)) T_A Wildcard Wildcard Wildcard (T_B (CC_B (T_B T_A))))
// This is not matched: (CC_B Int Int Wildcard (T_A Int Int))