package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Char, Byte], T_A[Byte]], b: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Int]]]
case class CC_B() extends T_A[T_A[T_A[Int]]]
case class CC_C[D](a: D, b: (T_B[CC_B, CC_A],T_B[Boolean, CC_B])) extends T_B[T_A[T_A[Byte]], D]
case class CC_D[E](a: T_A[E], b: CC_C[T_B[E, E]]) extends T_B[T_A[T_A[Byte]], E]
case class CC_E(a: Char, b: CC_B) extends T_B[T_A[T_A[Byte]], CC_C[Boolean]]

val v_a: T_B[T_A[T_A[Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, CC_C(_, (_,_))) => 1 
}
}