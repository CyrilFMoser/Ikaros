package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_A[Int, Byte], (Boolean,Boolean)], b: T_A[T_B[Boolean], T_A[Boolean, Char]]) extends T_A[T_A[T_A[Int, Boolean], Boolean], T_B[T_B[Boolean]]]
case class CC_B(a: Byte) extends T_A[T_A[T_A[Int, Boolean], Boolean], T_B[T_B[Boolean]]]
case class CC_C(a: T_B[Char], b: T_B[Boolean]) extends T_A[T_A[T_A[Int, Boolean], Boolean], T_B[T_B[Boolean]]]
case class CC_D(a: T_A[CC_A, Int], b: CC_B) extends T_B[Char]
case class CC_E() extends T_B[Char]
case class CC_F[D]() extends T_B[D]

val v_a: T_A[T_A[T_A[Int, Boolean], Boolean], T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_F()) => 2 
}
}