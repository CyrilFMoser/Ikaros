package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_A[T_B[CC_A, CC_A]], b: (T_A[Char],T_A[Int]), c: (Char,T_B[CC_A, CC_A])) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,CC_A()), _) => 1 
  case CC_B(_, (_,CC_B(_, _, _)), _) => 2 
}
}