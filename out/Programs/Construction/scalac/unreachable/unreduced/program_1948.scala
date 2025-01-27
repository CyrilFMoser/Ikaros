package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[(Boolean,Byte), T_A], Int]) extends T_A
case class CC_B(a: T_B[Int, T_A], b: T_A, c: T_B[T_B[Boolean, Int], T_B[Int, CC_A]]) extends T_A
case class CC_C(a: Byte, b: T_A, c: (T_A,Int)) extends T_A
case class CC_D[C, D](a: T_B[CC_A, C], b: CC_C, c: D) extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}