package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, (Boolean,T_A[Char, Int])]
case class CC_B() extends T_A[CC_A[T_A[Int, (Boolean,Boolean)]], (CC_A[Int],T_A[Int, Char])]
case class CC_C(a: T_A[T_A[CC_B, CC_B], Boolean], b: T_A[(Int,CC_B), CC_B], c: (T_A[CC_B, CC_B],Int)) extends T_A[CC_A[T_A[Int, (Boolean,Boolean)]], (CC_A[Int],T_A[Int, Char])]

val v_a: T_A[CC_A[T_A[Int, (Boolean,Boolean)]], (CC_A[Int],T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}