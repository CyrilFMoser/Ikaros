package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Boolean, Char], (Boolean,Boolean)], C]
case class CC_B(a: CC_A[(Int,Char)], b: (CC_A[Int],CC_A[Byte])) extends T_A[T_A[T_A[Boolean, Char], (Boolean,Boolean)], (CC_A[Byte],T_A[Char, Byte])]
case class CC_C[D](a: T_A[D, D], b: Int, c: D) extends T_A[T_A[T_A[Boolean, Char], (Boolean,Boolean)], D]

val v_a: T_A[T_A[T_A[Boolean, Char], (Boolean,Boolean)], (CC_A[Byte],T_A[Char, Byte])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), (CC_A(),CC_A())) => 1 
  case CC_C(_, _, _) => 2 
}
}