package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: (T_A[Byte, Int],CC_A[Char]), b: T_A[T_A[D, D], D], c: (T_A[Int, Int],T_A[(Byte,Byte), Int])) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A()), _, _) => 1 
}
}