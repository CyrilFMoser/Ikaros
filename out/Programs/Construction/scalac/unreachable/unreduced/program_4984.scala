package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[T_B[T_A[Boolean, Char], T_A[Boolean, Char]], T_B[T_A[Boolean, Char], T_A[Boolean, Char]]], T_B[T_A[Boolean, Char], T_A[Boolean, Char]]], b: T_B[E, E]) extends T_A[T_A[E, E], E]
case class CC_B[G]() extends T_A[T_A[G, G], G]
case class CC_C(a: CC_B[(Byte,Byte)], b: T_B[CC_A[Byte], Boolean], c: (CC_B[Boolean],T_A[Byte, Int])) extends T_A[T_A[(T_A[Int, Byte],Int), (T_A[Int, Byte],Int)], (T_A[Int, Byte],Int)]
case class CC_D[H](a: H, b: T_A[T_A[H, H], H], c: Boolean) extends T_B[T_A[H, H], H]
case class CC_E() extends T_B[T_B[CC_D[CC_C], CC_B[CC_C]], CC_C]

val v_a: T_B[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_D(true, CC_A(_, _), _) => 0 
  case CC_D(false, CC_A(_, _), _) => 1 
  case CC_D(true, CC_B(), _) => 2 
  case CC_D(false, CC_B(), _) => 3 
}
}