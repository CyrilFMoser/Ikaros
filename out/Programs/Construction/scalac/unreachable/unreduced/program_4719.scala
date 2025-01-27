package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[H, G](a: T_A[H, H]) extends T_A[G, H]
case class CC_C(a: Boolean) extends T_B[CC_B[CC_B[Int, (Int,Byte)], T_A[Boolean, Byte]], T_B[CC_B[Byte, Int], Boolean]]
case class CC_D(a: T_A[T_B[CC_C, Int], T_A[CC_C, CC_C]], b: CC_C, c: T_B[Boolean, CC_B[CC_C, CC_C]]) extends T_B[CC_B[CC_B[Int, (Int,Byte)], T_A[Boolean, Byte]], T_B[CC_B[Byte, Int], Boolean]]
case class CC_E() extends T_B[CC_B[CC_B[Int, (Int,Byte)], T_A[Boolean, Byte]], T_B[CC_B[Byte, Int], Boolean]]

val v_a: T_B[CC_B[CC_B[Int, (Int,Byte)], T_A[Boolean, Byte]], T_B[CC_B[Byte, Int], Boolean]] = null
val v_b: Int = v_a match{
  case CC_C(true) => 0 
  case CC_C(false) => 1 
  case CC_D(CC_A(), CC_C(_), _) => 2 
  case CC_D(CC_B(CC_A()), CC_C(_), _) => 3 
  case CC_D(CC_B(CC_B(_)), CC_C(_), _) => 4 
}
}
// This is not matched: CC_E()