package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B() extends T_B[T_A[T_B[(Char,Byte)]]]
case class CC_C(a: T_A[T_B[CC_B]], b: Int) extends T_B[T_A[T_B[(Char,Byte)]]]
case class CC_D(a: T_A[CC_A[Char]], b: T_A[CC_A[(Char,Int)]], c: ((CC_C,CC_C),Int)) extends T_B[T_A[T_B[(Char,Byte)]]]

val v_a: T_B[T_A[T_B[(Char,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_D(CC_A(_), CC_A(_), _) => 1 
}
}
// This is not matched: CC_C(CC_A(_), _)