package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, E], b: T_A[E, E]) extends T_A[F, E]
case class CC_B(a: CC_A[T_B[Boolean, (Int,Byte)], T_B[(Boolean,Char), Boolean]], b: T_B[CC_A[Byte, Int], T_A[(Int,Byte), (Boolean,Boolean)]]) extends T_A[T_A[Byte, T_A[(Int,Char), Byte]], T_B[Char, T_A[Int, Byte]]]
case class CC_C() extends T_A[T_A[Byte, T_A[(Int,Char), Byte]], T_B[Char, T_A[Int, Byte]]]
case class CC_D(a: T_A[T_B[Int, CC_C], CC_C]) extends T_B[Int, CC_C]

val v_a: T_A[T_A[Byte, T_A[(Int,Char), Byte]], T_B[Char, T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}