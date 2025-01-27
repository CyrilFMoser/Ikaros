package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Byte, Boolean], T_A[Boolean, (Boolean,Int)]]]
case class CC_B(a: T_A[CC_A[Char], Boolean], b: T_A[CC_A[Byte], T_A[Int, Byte]], c: Int) extends T_A[CC_A[CC_A[Char]], T_A[T_A[Byte, Boolean], T_A[Boolean, (Boolean,Int)]]]

val v_a: T_A[CC_A[CC_A[Char]], T_A[T_A[Byte, Boolean], T_A[Boolean, (Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}