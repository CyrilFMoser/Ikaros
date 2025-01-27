package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Char, (Int,Int)], C]
case class CC_B[D](a: D, b: (T_A[Byte, Boolean],CC_A[Char])) extends T_A[T_A[Char, (Int,Int)], D]

val v_a: T_A[T_A[Char, (Int,Int)], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,CC_A())) => 1 
}
}