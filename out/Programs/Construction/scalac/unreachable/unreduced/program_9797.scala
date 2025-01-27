package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[(Char,Char), Byte], T_A[Boolean, Byte]], b: Boolean) extends T_A[T_A[T_A[Boolean, Byte], (Byte,(Int,Byte))], (T_A[Char, Int],((Boolean,Byte),Boolean))]
case class CC_B[C](a: CC_A, b: T_A[T_A[C, C], C]) extends T_A[T_A[T_A[Boolean, Byte], Byte], C]
case class CC_C[D]() extends T_A[T_A[T_A[Boolean, Byte], Byte], D]

val v_a: T_A[T_A[T_A[Boolean, Byte], Byte], CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_C() => 1 
}
}