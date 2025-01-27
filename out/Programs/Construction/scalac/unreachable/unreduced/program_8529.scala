package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Int, (Char,Byte)], C]
case class CC_B() extends T_A[T_A[Int, (Char,Byte)], T_A[T_A[Boolean, Boolean], CC_A[Int]]]
case class CC_C[D](a: T_A[D, CC_B], b: D, c: T_A[D, D]) extends T_A[T_A[Int, (Char,Byte)], D]

val v_a: T_A[T_A[Int, (Char,Byte)], CC_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}