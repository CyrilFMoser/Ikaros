package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Boolean,Boolean), Boolean], b: T_A[(Boolean,Char), Boolean], c: T_A[T_A[Char, Boolean], T_A[(Byte,Byte), Boolean]]) extends T_A[T_A[T_A[Boolean, Byte], T_A[Boolean, Char]], T_A[T_A[Boolean, Byte], Byte]]
case class CC_B() extends T_A[T_A[T_A[Boolean, Byte], T_A[Boolean, Char]], T_A[T_A[Boolean, Byte], Byte]]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Boolean, Char]], T_A[T_A[Boolean, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}