package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Char], T_A[Boolean, Byte]]) extends T_A[T_A[T_A[Char, Boolean], T_A[(Boolean,Byte), Int]], Boolean]
case class CC_B() extends T_A[T_A[T_A[Char, Boolean], T_A[(Boolean,Byte), Int]], Boolean]

val v_a: T_A[T_A[T_A[Char, Boolean], T_A[(Boolean,Byte), Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}