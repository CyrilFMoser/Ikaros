package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Int]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[Byte], b: (T_A[CC_A],T_B[CC_A])) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: ((CC_B,CC_B),Boolean), b: T_A[T_A[Byte]], c: CC_A) extends T_A[T_A[T_A[Char]]]
case class CC_D(a: Char, b: Boolean) extends T_B[T_B[CC_A]]
case class CC_E[C](a: CC_D, b: T_B[C]) extends T_B[C]
case class CC_F(a: CC_E[Boolean], b: (Int,T_A[Char]), c: CC_D) extends T_B[T_B[CC_A]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_E(CC_D(_, _), CC_E(_, _))) => 0 
  case CC_B(_, (_,CC_E(_, _))) => 1 
  case CC_C(_, _, _) => 2 
}
}