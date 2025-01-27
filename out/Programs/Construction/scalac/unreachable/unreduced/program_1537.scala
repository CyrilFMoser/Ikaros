package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean], b: (T_A[Char, Char],T_A[Boolean, Char])) extends T_A[T_A[T_A[Int, Byte], (Boolean,Boolean)], C]
case class CC_B[D]() extends T_A[T_A[T_A[Int, Byte], (Boolean,Boolean)], D]
case class CC_C(a: Char) extends T_A[T_A[T_A[Int, Byte], (Boolean,Boolean)], T_A[CC_A[Char], CC_A[Byte]]]

val v_a: T_A[T_A[T_A[Int, Byte], (Boolean,Boolean)], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
}
}