package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[(Char,T_A[Boolean, Int]), C]
case class CC_B(a: Int, b: T_A[T_A[(Char,Int), Int], CC_A[(Int,Char), Boolean]], c: T_A[CC_A[Char, (Char,Boolean)], T_A[Int, Byte]]) extends T_A[(Char,T_A[Boolean, Int]), CC_A[Byte, Char]]

val v_a: T_A[(Char,T_A[Boolean, Int]), CC_A[Byte, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}