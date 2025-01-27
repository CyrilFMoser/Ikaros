package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, (T_A[(Char,Byte), T_B],T_A[T_B, (Boolean,Char)])]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: D) extends T_A[D, (T_A[(Char,Byte), T_B],T_A[T_B, (Boolean,Char)])]

val v_a: T_A[Int, (T_A[(Char,Byte), T_B],T_A[T_B, (Boolean,Char)])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}