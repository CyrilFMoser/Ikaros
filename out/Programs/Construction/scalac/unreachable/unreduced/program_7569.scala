package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Char, b: T_A[T_B[Byte, Boolean], T_A[Int, Boolean]], c: (T_B[(Char,Byte), (Int,Byte)],T_A[Byte, Boolean])) extends T_A[Int, T_A[Byte, T_A[Int, Int]]]
case class CC_B() extends T_A[Int, T_A[Byte, T_A[Int, Int]]]

val v_a: T_A[Int, T_A[Byte, T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}