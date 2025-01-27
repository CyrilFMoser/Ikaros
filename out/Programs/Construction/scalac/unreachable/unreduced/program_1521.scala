package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[T_B, Boolean],Int), b: T_A[C, C]) extends T_A[C, Boolean]
case class CC_B(a: CC_A[((Char,Byte),T_B)], b: T_A[(Byte,(Int,Int)), T_A[(Char,Int), Boolean]], c: (T_A[Boolean, Boolean],CC_A[T_B])) extends T_B
case class CC_C(a: CC_A[T_B], b: CC_A[T_B], c: T_A[T_A[Char, (Byte,Char)], T_A[CC_B, Boolean]]) extends T_B
case class CC_D(a: CC_B, b: T_A[CC_C, Boolean]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, (_,_)) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_C(CC_A(_, _), _, _)