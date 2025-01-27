package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Byte, Int],Char), c: (T_A[Byte, Byte],T_A[Boolean, Char])) extends T_A[C, T_A[Byte, (Boolean,Byte)]]
case class CC_B[D](a: D, b: CC_A[D]) extends T_A[T_A[D, D], D]
case class CC_C(a: T_A[(Char,Int), CC_A[Int]], b: CC_B[Char]) extends T_A[T_A[Boolean, Boolean], Boolean]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _)) => 0 
  case CC_C(_, _) => 1 
}
}