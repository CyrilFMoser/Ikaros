package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: (T_B,T_A[(Boolean,Char)]), c: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[Int], b: T_A[T_A[Boolean]], c: T_A[T_A[Boolean]]) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, (_,_), CC_A(_, _, _)), CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_C() => 1 
}
}