package Program_31 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B(a: Byte, b: Int) extends T_A[Int]
case class CC_C[C](a: T_A[C]) extends T_B
case class CC_D(a: CC_A[Char], b: (Char,(Int,Int)), c: CC_B) extends T_B
case class CC_E(a: Byte, b: CC_B, c: CC_C[Char]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_C(CC_A()) => 1 
  case CC_D(_, (_,(_,_)), _) => 2 
  case CC_D(_, _, CC_B(_, _)) => 3 
  case CC_D(_, ('x',(_,_)), CC_B(_, _)) => 4 
  case CC_D(CC_A(), (_,(_,_)), CC_B(_, _)) => 5 
  case CC_D(CC_A(), ('x',(_,_)), _) => 6 
  case CC_D(_, (_,(_,_)), CC_B(_, _)) => 7 
  case CC_E(0, _, _) => 8 
  case CC_E(_, _, _) => 9 
  case CC_E(0, _, CC_C(_)) => 10 
  case CC_E(_, CC_B(_, _), CC_C(_)) => 11 
}
}
// This is not matched: (CC_C Int (CC_B Wildcard Int (T_A Int)) T_B)
// This is not matched: (CC_D Wildcard Wildcard Wildcard T_B)