package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Boolean, b: T_B[Int]) extends T_A[T_A[(Byte,(Byte,Char))]]
case class CC_B(a: (T_B[CC_A],Int), b: T_B[CC_A]) extends T_A[T_A[(Byte,(Byte,Char))]]
case class CC_C(a: CC_B, b: T_A[T_A[CC_A]]) extends T_A[T_A[(Byte,(Byte,Char))]]

val v_a: T_A[T_A[(Byte,(Byte,Char))]] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _) => 0 
  case CC_C(CC_B(_, _), _) => 1 
}
}
// This is not matched: CC_A(_, _)