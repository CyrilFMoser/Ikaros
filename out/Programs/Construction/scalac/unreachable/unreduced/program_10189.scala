package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Byte, (Int,Byte)], b: (Boolean,T_A[Boolean, Byte])) extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Char]], T_A[T_A[Boolean, Boolean], Byte]]
case class CC_B(a: Int) extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Char]], T_A[T_A[Boolean, Boolean], Byte]]
case class CC_C() extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Char]], T_A[T_A[Boolean, Boolean], Byte]]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Char, Char]], T_A[T_A[Boolean, Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}