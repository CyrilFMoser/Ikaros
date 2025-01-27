package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Boolean], T_B[Boolean]], b: T_A[((Char,Int),Int), (Boolean,Char)]) extends T_A[T_B[T_A[Int, Int]], T_B[T_B[Byte]]]
case class CC_B(a: T_A[CC_A, Int]) extends T_A[T_B[T_A[Int, Int]], T_B[T_B[Byte]]]
case class CC_C() extends T_A[T_B[T_A[Int, Int]], T_B[T_B[Byte]]]
case class CC_D[D]() extends T_B[D]

val v_a: T_A[T_B[T_A[Int, Int]], T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)