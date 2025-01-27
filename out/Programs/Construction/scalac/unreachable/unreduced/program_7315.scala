package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, Int], b: D, c: (T_B[Char],T_B[Byte])) extends T_A[D, Int]
case class CC_B[E, F]() extends T_A[E, F]
case class CC_C(a: (T_A[Char, Char],CC_A[Byte])) extends T_A[T_B[Char], Int]
case class CC_D(a: T_A[T_B[Char], Int]) extends T_B[(T_A[(Int,Int), Int],(CC_C,CC_C))]
case class CC_E(a: T_A[(Boolean,Int), Boolean], b: Boolean) extends T_B[(T_A[(Int,Int), Int],(CC_C,CC_C))]

val v_a: T_B[(T_A[(Int,Int), Int],(CC_C,CC_C))] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _)) => 0 
  case CC_D(CC_B()) => 1 
  case CC_D(CC_C((_,_))) => 2 
  case CC_E(CC_B(), _) => 3 
}
}