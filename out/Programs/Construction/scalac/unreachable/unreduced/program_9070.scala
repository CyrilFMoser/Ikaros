package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_A[Byte, Boolean]]) extends T_A[T_A[Byte, Boolean], Int]
case class CC_B() extends T_A[T_A[Byte, Boolean], Int]
case class CC_C(a: CC_A, b: T_A[T_B[CC_B], Int]) extends T_A[T_A[Byte, Boolean], Int]
case class CC_D[D](a: (T_B[CC_A],Byte), b: Byte, c: D) extends T_B[D]

val v_a: T_A[T_A[Byte, Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_D((_,_), 0, _)) => 0 
  case CC_A(CC_D((_,_), _, _)) => 1 
  case CC_B() => 2 
  case CC_C(CC_A(CC_D(_, _, _)), _) => 3 
}
}