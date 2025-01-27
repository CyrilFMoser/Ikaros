package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: Byte, b: T_A[T_A[D, D], D], c: (T_A[Byte, Int],T_A[Char, Boolean])) extends T_A[T_A[D, D], D]
case class CC_C() extends T_A[T_A[T_A[T_A[Int, Byte], CC_A[Char]], T_A[T_A[Int, Byte], CC_A[Char]]], T_A[T_A[Int, Byte], CC_A[Char]]]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, (_,_)) => 1 
}
}