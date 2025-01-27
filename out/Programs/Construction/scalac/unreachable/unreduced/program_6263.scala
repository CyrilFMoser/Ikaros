package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Int, Int], T_A[(Byte,Byte), Int]], C]
case class CC_B(a: Int, b: T_A[T_A[Byte, Byte], CC_A[Int]]) extends T_A[T_A[T_A[Int, Int], T_A[(Byte,Byte), Int]], (T_A[Char, Byte],T_A[Boolean, Boolean])]

val v_a: T_A[T_A[T_A[Int, Int], T_A[(Byte,Byte), Int]], (T_A[Char, Byte],T_A[Boolean, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}