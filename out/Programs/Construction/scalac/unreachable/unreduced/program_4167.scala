package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[(Char,Byte), Char], T_B[Boolean, Int]], b: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B(a: T_A[Char], b: CC_A) extends T_A[T_A[Byte]]
case class CC_C(a: (CC_A,Boolean), b: T_B[T_A[Byte], T_A[Char]]) extends T_B[T_A[Byte], T_A[Char]]
case class CC_D[E, D]() extends T_B[D, E]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), CC_A(CC_D(), CC_A(_, _))) => 0 
  case CC_A(CC_D(), CC_A(CC_D(), CC_B(_, _))) => 1 
  case CC_A(CC_D(), CC_B(_, _)) => 2 
  case CC_B(_, CC_A(CC_D(), CC_A(_, _))) => 3 
  case CC_B(_, CC_A(CC_D(), CC_B(_, _))) => 4 
}
}