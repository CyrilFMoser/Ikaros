package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Char], b: T_B[T_A[Boolean]], c: (T_A[Char],Int)) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_B[(Boolean,T_A[Int])]
case class CC_C(a: (T_A[CC_B],T_A[Char])) extends T_B[(Boolean,T_A[Int])]
case class CC_D(a: T_A[((Int,Byte),Char)], b: CC_A, c: Boolean) extends T_B[(Boolean,T_A[Int])]

val v_a: T_B[(Boolean,T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((_,_)) => 1 
  case CC_D(_, CC_A(_, _, _), _) => 2 
}
}