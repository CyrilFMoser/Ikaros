package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Char, Int], T_A[Char, Byte]], C]
case class CC_B[D, E]() extends T_A[T_A[T_A[Char, Int], T_A[Char, Byte]], D]
case class CC_C[F](a: Boolean, b: (T_A[Byte, Int],CC_A[Char])) extends T_A[T_A[T_A[Char, Int], T_A[Char, Byte]], F]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Char, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(true, (_,CC_A())) => 2 
  case CC_C(false, (_,CC_A())) => 3 
}
}