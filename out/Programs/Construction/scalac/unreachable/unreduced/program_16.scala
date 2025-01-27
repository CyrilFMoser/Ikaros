package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: C) extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_A[D], c: D) extends T_A[D]
case class CC_C(a: Byte) extends T_B[Char]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_)) => 0 
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 1 
  case CC_B(CC_B(_, _, _), CC_A(_, _), _) => 2 
  case CC_B(CC_A(_, _), CC_B(_, _, _), _) => 3 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), _) => 4 
}
}