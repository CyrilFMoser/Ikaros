package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Int, T_A[Char, Int]], C]
case class CC_B(a: T_A[Boolean, CC_A[Char]], b: (T_A[Byte, Char],CC_A[Byte]), c: CC_A[T_A[Char, (Int,Byte)]]) extends T_A[T_A[Int, T_A[Char, Int]], Byte]

val v_a: T_A[T_A[Int, T_A[Char, Int]], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,CC_A()), _) => 1 
}
}