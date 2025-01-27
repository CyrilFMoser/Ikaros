package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_B[D]], b: T_B[D], c: (T_B[Char],T_A[Byte, Byte])) extends T_A[T_B[T_B[Byte]], D]
case class CC_B[E]() extends T_A[T_B[T_B[Byte]], E]
case class CC_C(a: Boolean, b: CC_B[T_B[Byte]], c: T_B[Byte]) extends T_B[Byte]
case class CC_D(a: T_B[Int]) extends T_B[T_B[Byte]]

val v_a: T_A[T_B[T_B[Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B() => 1 
}
}