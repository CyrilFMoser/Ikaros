package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_A[Char, Boolean]], b: T_B[T_A[(Char,Int), Boolean]], c: T_B[T_B[(Byte,Boolean)]]) extends T_A[T_B[T_B[Byte]], T_B[T_B[Byte]]]
case class CC_B(a: CC_A, b: T_A[Char, T_B[CC_A]], c: Byte) extends T_A[T_B[T_B[Byte]], T_B[T_B[Byte]]]
case class CC_C[D](a: D, b: T_B[D], c: T_B[D]) extends T_B[D]

val v_a: T_A[T_B[T_B[Byte]], T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_C(_, _, _))) => 0 
  case CC_B(CC_A(_, _, _), _, _) => 1 
}
}