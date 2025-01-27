package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Byte, Byte], T_A[(Byte,Byte), Boolean]], T_A[T_A[(Int,Byte), Byte], T_A[(Boolean,Boolean), Char]]]
case class CC_B(a: T_A[T_A[(Char,Boolean), CC_A], Int]) extends T_A[T_A[T_A[Byte, Byte], T_A[(Byte,Byte), Boolean]], T_A[T_A[(Int,Byte), Byte], T_A[(Boolean,Boolean), Char]]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[T_A[T_A[Byte, Byte], T_A[(Byte,Byte), Boolean]], T_A[T_A[(Int,Byte), Byte], T_A[(Boolean,Boolean), Char]]]

val v_a: T_A[T_A[T_A[Byte, Byte], T_A[(Byte,Byte), Boolean]], T_A[T_A[(Int,Byte), Byte], T_A[(Boolean,Boolean), Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}