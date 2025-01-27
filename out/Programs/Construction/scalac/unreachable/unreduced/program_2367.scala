package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Char], T_A[Int, Char]]) extends T_A[T_A[T_A[Byte, Byte], T_A[(Int,Byte), Boolean]], Boolean]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Byte, Byte], T_A[(Int,Byte), Boolean]], Boolean]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[Byte, Byte], T_A[(Int,Byte), Boolean]], Boolean]

val v_a: T_A[T_A[T_A[Byte, Byte], T_A[(Int,Byte), Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_C(_) => 2 
}
}