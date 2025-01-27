package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Byte, T_A[Byte, Int]], T_A[T_A[Boolean, Boolean], T_A[Byte, (Boolean,Int)]]]
case class CC_B(a: Char, b: T_A[CC_A, T_A[CC_A, CC_A]], c: T_A[Int, Byte]) extends T_A[T_A[Byte, T_A[Byte, Int]], T_A[T_A[Boolean, Boolean], T_A[Byte, (Boolean,Int)]]]
case class CC_C(a: (CC_B,CC_A), b: CC_B) extends T_A[T_A[Byte, T_A[Byte, Int]], T_A[T_A[Boolean, Boolean], T_A[Byte, (Boolean,Int)]]]

val v_a: T_A[T_A[Byte, T_A[Byte, Int]], T_A[T_A[Boolean, Boolean], T_A[Byte, (Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C((CC_B(_, _, _),CC_A()), CC_B(_, _, _)) => 2 
}
}