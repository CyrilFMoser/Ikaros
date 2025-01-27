package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Int, Byte],T_A[Boolean, Byte])) extends T_A[T_A[Int, T_A[Byte, Byte]], T_A[T_A[Char, Boolean], T_A[Byte, (Boolean,Byte)]]]
case class CC_B() extends T_A[T_A[Int, T_A[Byte, Byte]], T_A[T_A[Char, Boolean], T_A[Byte, (Boolean,Byte)]]]

val v_a: T_A[T_A[Int, T_A[Byte, Byte]], T_A[T_A[Char, Boolean], T_A[Byte, (Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
}
}