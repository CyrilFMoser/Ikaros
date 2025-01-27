package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Int], T_A[Boolean, Int]], b: T_A[T_A[Byte, (Int,Int)], T_A[Char, Boolean]], c: Byte) extends T_A[T_A[Byte, T_A[Byte, Byte]], T_A[Byte, T_A[Boolean, Boolean]]]
case class CC_B(a: T_A[((Char,Boolean),(Int,Byte)), CC_A], b: (T_A[CC_A, CC_A],T_A[(Char,Char), Boolean])) extends T_A[T_A[Byte, T_A[Byte, Byte]], T_A[Byte, T_A[Boolean, Boolean]]]
case class CC_C() extends T_A[T_A[Byte, T_A[Byte, Byte]], T_A[Byte, T_A[Boolean, Boolean]]]

val v_a: T_A[T_A[Byte, T_A[Byte, Byte]], T_A[Byte, T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 0) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_, _) => 2 
  case CC_C() => 3 
}
}