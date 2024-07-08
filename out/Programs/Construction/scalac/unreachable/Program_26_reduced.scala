object Test {
sealed trait T_A[A, B]
case class CC_A(a:     T_A[Int, Boolean]                    ) extends T_A[Boolean, (Int,T_A[Char, Char])]
case class CC_B() extends T_A[Boolean, (Int,T_A[Char, Char])]
val v_a: T_A[Boolean, (Int,T_A[Char, Char])] = null
val v_b      = v_a match{
  case CC_A(_) => 0
  case CC_B() => 1
}
}
